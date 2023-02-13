package class24;

public class FileTester {
    public static void main(String[] args) {

        File [] files={new JavaFile(1024),new WordFile(25),
                new PdfFile(50)};

        for (File x:files){
            x.open();
            x.edit();
            x.close();
        }
        System.out.println("+++++++++++++++");
        for (int i = 0; i < files.length ; i++) {
            File f=files[i];
            f.open();
            f.edit();
            f.close();
        }
    }
}
