package sec01.ex01;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/upload.do")
public class FileUpload extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response)	throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
			String encoding = "utf-8";
			
			// 업로드할 파일 경로 지정
			 
		
			// 파일 경로 설정
			
		
			// 최대 업로드 가능한 파일 크기 설정
			

			ServletFileUpload upload = new ServletFileUpload(factory);
			try {
				// request 객체에서 매개변수를 List로 가져옴.
				List items = upload.parseRequest(request);
				for (int i = 0; i < items.size(); i++) {
					// 파일 업로드 창에서 업로드 된 항목들을 하나씩 가져옴.
					
	
					// 폼 필드이면 전송된 매개변수 값을 출력
					if (fileItem.isFormField()) {
						System.out.println(fileItem.getFieldName() + "=" + fileItem.getString(encoding));
					} else {  // 폼 필드가 아니면 파일 업로드 수행
						
						
						
					} // end else
				} // end for
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}













