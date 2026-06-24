public class Main {

    public static void main(String[] args) {

        DocumentFactory word = new WordFactory();
        DocumentFactory pdf = new PdfFactory();
        DocumentFactory excel = new ExcelFactory();

        word.createDocument().open();
        pdf.createDocument().open();
        excel.createDocument().open();
    }
}