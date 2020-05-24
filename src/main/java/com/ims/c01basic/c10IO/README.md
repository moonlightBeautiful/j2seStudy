IO流学习
    简介:
        两个设备之间的数据的传输成为流，流是字节的集合。把流抽象成各种类，方便对数据操作。
    I/O流结构:
        一般是内存和硬盘之间的数据传输
        根据数据类型不同，分为字符流和字节流。根据数据流向不同，分为输入流和输出流。
                    Reader
            字符流
                    Writer
        I/O流
                    InputStream
            字节流
                    OutputStream
    文件操作类File
        方法：
            1.boolean mkdir(): 在存在的路径下创建文件夹，如果已经存在，则返回false 目录只能一级一级的创建。
              boolean mkdirs():在不存在的路径下创建文件夹，会创建路径，如果已经存在，则返回false 目录只能一级一级的创建
            2.boolean createNewFile()：创建文件，路径必须存在
            3.boolean delete()：删除文件夹或者文件，只能删除空的文件夹
            4.boolean exists()：是否存在
            5.File[] listFiles()：文件件下的文件和文件夹
            6.boolean  isDirectory()：是否是文件夹，前提是文件夹存在。
    字节流：非文本的文件，也可以用于文本文件。
        InputStream输入流：抽象类，java会使用系统默认的字符编码把文件内容字符转换成字节流
            主要用到子类FileInputStream 和 BufferedInputStream
            1.FileInputStream(File)：文件必须存在，否则报空指针
                方法：
                    1.read(字节数组)：从数据流中取字节到字节数组中，最后最好把字节数组转成String
                    2.read()：从数据流中取一个字节并返回这个字节，类型是int，要转换成字节byte。读取不到就返回-1。
                new String(字节数组,"字符编码，中文系统默认是GBK)
        OutStream输出流：抽象类，java会使用系统默认的字符编码把字节流转换成文件内容字符
            主要用到子类FileOutputStream 和 BufferedOutputStream
            1.FileOutputStream(File)
                可以选择覆盖或者追加方式输出字节流到文件
                构造方法 参数 File 文件可以不存在，输出的时候会文件自动创建，但是路径必须自己创建
                方法：
                    1.write(字节数组)：把字节数组内容用系统默认字符编码方式写入到文件，会把原文件的编码方式变成系统默认字符编码方式。
                 byte b[] = str.getBytes("字符编码，中文系统默认是GBK");
        带缓冲的输入输出字节流
            就是在内存和硬盘之间建立缓存区，流先放在缓冲区，用到再拿出来使用，效率高。
            类：BufferedInputStream和BufferedOutputStream，方法和FileInputStream与FileOutputStream一样。
    字符流：文本文件
        1.Reader
            FileReader
            方法：
                1.read(字符数组)：从数据流中取字符到字符数组中，最后最好把字符数组转成String。 
                2.read()：从数据流中取一个字符并返回这个字符，类型是int，要转换成字符char。读取不到就返回-1。
            new String(字符数组)
        2.Write
            FileWriter
            方法：
                1.write("字符串)
    NOTE：流用完之后记得关闭