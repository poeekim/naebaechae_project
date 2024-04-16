package spring2;

import java.io.FileWriter;
import java.io.IOException;

//파일을 생성(위치)->파일내부에 문자열을 출력시켜주는 프로그램
public class OutFileImpl implements OutFile {
	
	private String filePath;//경로명 및 만들어질 파일명 저장
	
	//<property >
	public void setFilePath(String filePath) {//c:/webtest/good.txt
		this.filePath = filePath;
		System.out.println("setFilePath()호출됨(filePath)=>"+filePath);
	}
     //MessageBeanImplDI->sayHell()=>out(message)
	@Override
	public void out(String message) throws IOException {
		// TODO Auto-generated method stub
        //한글데이터->FileWriter, 영문->FileOutputStream
		FileWriter fw=new FileWriter(filePath);//ctrl+shift+o
		fw.write(message);
		fw.close();//메모리 해제
	}
}


