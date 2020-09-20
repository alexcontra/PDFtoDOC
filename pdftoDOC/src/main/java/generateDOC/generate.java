package generateDOC;
import com.aspose.pdf.DocSaveOptions;
import com.aspose.pdf.Document;
public class generate {
    public generate(String fileName)
    {
        Document doc = new Document(fileName);
        DocSaveOptions saveOptions = new DocSaveOptions();
        saveOptions.setMode(DocSaveOptions.RecognitionMode.Flow);
        saveOptions.setRelativeHorizontalProximity(2.5f);
        saveOptions.setRecognizeBullets(true);
        String newName = fileName.replace(".pdf","");
        doc.save(fileName+"new.docx",saveOptions);
    }
}
