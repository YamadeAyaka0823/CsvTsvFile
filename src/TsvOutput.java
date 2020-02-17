import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TsvOutput {

	public static void main(String[] args) throws IOException {
		
		File tsv = new File("/Users/yamadeayaka/arashi.tsv"); //元あるtsvファイルを読み込む
		BufferedWriter bw = new BufferedWriter(new FileWriter(tsv, true)); //trueだと追記、falseだと上書き
		
		bw.write("山出彩夏" + "	" + "'2000-06-01'" + "	" + "ayaka@gmail.com" + "	" + "ayaka" + "	" + "1");
		bw.newLine();
		bw.close();

	}

}
