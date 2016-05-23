
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;

public class PdfAttributeWriter {
	
	Paragraph paragraph = new Paragraph();
	
	Font fonts[] = {
		new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.UNDERLINE),
		new Font(Font.FontFamily.TIMES_ROMAN, 10, Font.NORMAL)
	};
	
	public void writingString() {
		paragraph.add((Element) fonts[0]);
	} 
	
	public void writingOthers() {
		paragraph.add((Element) fonts[1]);
	}
}
