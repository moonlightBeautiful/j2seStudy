package com.workingGet.barCode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class QRCodeApp {

    /**
     * ��ά��BufferedImage�������ɷ���
     *
     * @param contents ��ά������
     * @param width    ��ά��ͼƬ���
     * @param height   ��ά��ͼƬ�߶�
     * @param margin   ��ά��߿�(0,2,4,8)
     * @throws Exception
     * @author LinWenLi
     * @date 2018-08-23 12:51:00
     * @return: BufferedImage
     */
    public static BufferedImage createQRCode(String contents, int width, int height, int margin) throws Exception {
        if (contents == null || contents.equals("")) {
            throw new Exception("contents����Ϊ�ա�");
        }
        // ��ά�������������
        Map<EncodeHintType, Object> hints = new HashMap<>();
        hints.put(EncodeHintType.CHARACTER_SET, CharacterSetECI.UTF8);// ���ñ����ַ���utf-8
        hints.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);// ���þ���ȼ�L/M/Q/H,����ά�뱻���һ����ʱ������ȼ�Խ�ߣ�Խ���ܶ�ȡ�ɹ���ͬ���ģ�����ȼ�Խ�ߣ���λ����ڵ���ĵ�Խ�࣬����ɨ��ʱ��ʶ������ʱ��Խ������ǰ���õȼ�Ϊ��ߵȼ�H
        hints.put(EncodeHintType.MARGIN, margin);// �����÷�ΧΪ0-10�������ĸ��仯0 1(2) 3(4 5 6) 7(8 9 10)
        // ����ͼƬ����ΪQRCode
        BarcodeFormat format = BarcodeFormat.QR_CODE;
        // ����λ�������
        BitMatrix matrix = null;
        try {
            // ���ɶ�ά���Ӧ��λ�������
            matrix = new MultiFormatWriter().encode(contents, format, width, height, hints);
        } catch (WriterException e) {
            e.printStackTrace();
        }
        // ����λ����תͼƬ�Ĳ���
        MatrixToImageConfig config = new MatrixToImageConfig(Color.black.getRGB(), Color.white.getRGB());
        // λ�������תBufferedImage����
        BufferedImage qrcode = MatrixToImageWriter.toBufferedImage(matrix, config);
        return qrcode;
    }

    /**
     * ��ά�����LOGO
     *
     * @param qrcode
     * @param width            ��ά��ͼƬ���
     * @param height           ��ά��ͼƬ�߶�
     * @param logoPath         ͼ��LOGO·��
     * @param logoSizeMultiple ��ά����LOGO�Ĵ�С����
     * @throws Exception
     * @author LinWenLi
     * @date 2018-08-23 13:17:07
     * @return: BufferedImage
     */
    public static BufferedImage createQRCodeWithLogo(BufferedImage qrcode, int width, int height, String logoPath, int logoSizeMultiple) throws Exception {
        File logoFile = new File(logoPath);
        if (!logoFile.exists() && !logoFile.isFile()) {
            throw new Exception("ָ����LOGOͼƬ·�������ڣ�");
        }
        try {
            // ��ȡLOGO
            BufferedImage logo = ImageIO.read(logoFile);
            // ����LOGO���
            int logoHeight = qrcode.getHeight() / logoSizeMultiple;
            int logowidth = qrcode.getWidth() / logoSizeMultiple;
            // ���÷���LOGO�Ķ�ά��ͼƬ��ʼλ��
            int x = (qrcode.getWidth() - logowidth) / 2;
            int y = (qrcode.getHeight() - logoHeight) / 2;
            // �½��ջ���
            BufferedImage combined = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
            // �½�����
            Graphics2D g = (Graphics2D) combined.getGraphics();
            // ����ά����Ƶ�����
            g.drawImage(qrcode, 0, 0, null);
            // ���ò�͸���ȣ���ȫ��͸��1f,�����÷�Χ0.0f-1.0f
            g.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
            // ����LOGO
            g.drawImage(logo, x, y, logowidth, logoHeight, null);
            return combined;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /**
     * ������ָ��·��
     *
     * @param bufferedImage
     * @param filePath      ͼƬ����·��
     * @param fileName      ͼƬ�ļ���
     * @param formatName    ͼƬ��ʽ
     * @author LinWenLi
     * @date 2018-08-23 12:59:03
     * @return: boolean
     */
    public static boolean generateQRCodeToPath(BufferedImage bufferedImage, String filePath, String fileName, String formatName) {
        // �ж�·���Ƿ���ڣ��������򴴽�
        File path = new File(filePath);
        if (!path.exists()) {
            path.mkdirs();
        }
        // ·���󲹳�б��
        if (filePath.lastIndexOf("\\") != filePath.length() - 1) {
            filePath = filePath + "\\";
        }
        // ���ΪͼƬ���ɵ�ȫ·��
        String fileFullPath = filePath + fileName + "." + formatName;
        boolean result = false;
        try {
            // ���ͼƬ�ļ���ָ��λ��
            result = ImageIO.write(bufferedImage, formatName, new File(fileFullPath));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
