import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvOutput {

	public static void main(String[] args) throws IOException {
		
		File csv = new File("/Users/yamadeayaka/akb48.csv"); //元あるcsvファイルを読み込む
		BufferedWriter bw = new BufferedWriter(new FileWriter(csv, true)); //trueだと追記、falseだと上書き
		
		bw.write("小嶋陽菜" + "," + "'2000-05-01'" + "," + "haruna@gmail.com" + "," + "haruna" + "," + "3");
		bw.newLine();
		bw.close();

	}

}
