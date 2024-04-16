package spring2;

import java.io.IOException;

//콘솔에만 문자열을 출력+파일을 생성->콘솔에 출력할 문자열을 저장시키고 싶다.
public interface OutFile {
	public void out(String message) throws IOException;
}
