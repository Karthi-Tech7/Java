import java.io.*;
import org.apache.commons.io.FileUtils;
import java.util.*;
public class FileOp {
	public static void main(String[] args) throws IOException {
		File student = new File("D:\\FileOperation\\problems.txt");
		boolean mkdir = student.mkdir();
		System.out.println(mkdir);
		boolean cnf = student.createNewFile();
		System.out.println(cnf);
		boolean exists = student.exists();
		System.out.println("file exists:"+exists);
		boolean file = student.isFile();
		System.out.println("file:"+file);
		String gn = student.getName();
		System.out.println("getname:"+gn);
		String ap = student.getAbsolutePath();
		System.out.println("Ap: "+ap);
		boolean read = student.canRead();
		System.out.println("canRead:"+read);
		boolean write = student.canWrite();
		System.out.println("canWrite:"+write);
		boolean delete = student.delete();
		System.out.println("delete:"+delete);
		System.out.println(" ");
		
		File myFolder = new File("D:\\FileOperation\\JavaProgram");
//        System.out.println("New Directory created: " + myFolder.mkdir());
//        
        File myFile = new File(myFolder, "front.txt");
//        System.out.println("New file created: " + myFile.createNewFile());
        
		String[] list = myFolder.list();
		for(String a:list)
		{
			System.out.println("listfiles:"+a);
		}
		
		File[] lf = myFolder.listFiles();
		for(File d:lf)
		{
			System.out.println("listFolders:"+d);
		}
		
		FileWriter fw = new FileWriter(myFile);
        fw.write("Java Program");
        fw.close();
		
		Scanner reader = new Scanner(myFile);
        while (reader.hasNextLine()) {
            String rdnextLine = reader.nextLine();
            System.out.println("reader File content: " + rdnextLine);
        }
        reader.close();
        
        List<String> io = FileUtils.readLines(myFile, "UTF-8");
        FileUtils.write(myFile, "\njava Programming Language", "UTF-8", true);
        System.out.println(io);
	}
}
