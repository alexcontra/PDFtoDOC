package generateDOC;
import com.aspose.pdf.DocSaveOptions;
import com.aspose.pdf.Document;
public class generate {
    public generate(String fileName)
    {
        Document doc = new Document("pdftoDOC/"+fileName);
        DocSaveOptions saveOptions = new DocSaveOptions();
        saveOptions.setFormat(DocSaveOptions.DocFormat.DocX);
        String newname = fileName.replace(".pdf","");
        doc.save(fileName+"new.docx",saveOptions);
    }
}
