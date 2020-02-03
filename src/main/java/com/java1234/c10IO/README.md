IO流学习
    简介:
        两个设备之间的数据的传输成为流，流是字节的集合。把流抽象成各种类，方便对数据操作。
    I/O流结构:
        根据数据类型不同，分为字符流和字节流。
        根据数据流向不同，分为输入流和输出流。
                    Reader
            字节流
                    Writer
        I/O流
                    InputStream
            字符流
                    OutputStream
    文件操作类File
        方法：
            1.boolean mkdir():创建文件夹，如果已经存在，则返回false
            2.boolean createNewFile()：创建文件
            3.boolean delete()：删除文件夹或者文件，只能删除空的文件夹
            4.boolean exists()：是否存在
            5.File[] listFiles()：文件件下的文件和文件夹
            6.boolean  isDirectory()：是否是文件夹