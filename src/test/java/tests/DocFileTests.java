package tests;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromDocFile;
import static utils.Files.readTextFromDocxFile;

public class DocFileTests {

    @Test
    void checkDocFile() {
        String docFilePath = "./src/test/resources/files/testDoc.doc";
        String expectedData = "testDoctext1";

        String actualData = readTextFromDocFile(docFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void checkDocxFile() {
        String docxFilePath = "./src/test/resources/files/testDocx.docx";
        String expectedData = "testDocxtext1";

        String actualData = readTextFromDocxFile(docxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
