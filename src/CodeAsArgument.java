import java.io.File;
import java.io.FileFilter;

public class CodeAsArgument {
    public static void main(String args[]){

        /***********************************************************
        *Method reference
         ************************************************************/
        File[] hiddenFiles = new File(".").listFiles(File::isFile);
        for(File file:hiddenFiles){
            System.out.println("::File Name:::: "+file.getName());
        }

        /***********************************************************
         *using code as argument
         ************************************************************/
        File[] hiddenFilesOld = new File(".").listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.isFile();
            }
        });
        for(File file:hiddenFilesOld){
            System.out.println("::File Name old way:::: "+file.getName());
        }
    }
}
