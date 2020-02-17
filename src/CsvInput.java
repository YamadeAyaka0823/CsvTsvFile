import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class CsvInput {

	public static void main(String[] args) throws IOException {
		
		//ファイルを読み込む
		FileReader fr = new FileReader("/Users/yamadeayaka/akb48.csv");
		BufferedReader br = new BufferedReader(fr);
		
		//読み込んだファイルを1行ずつ処理する
		String line;
		StringTokenizer token; //文字列を指定した区切り文字で分割することができるクラス
		
		while((line = br.readLine()) != null) { //readLine()で1行ずつ読み込む
			//区切り文字","で分割する
			token = new StringTokenizer(line, ",");
			
			while(token.hasMoreTokens()) { //hasMoreTokens()次のトークンがあればtrueを返す
				System.out.println(token.nextToken()); //nextToken()次のトークンを返す
			}
			System.out.println("**********");
		}
		//処理終了
		br.close();

	}

}
