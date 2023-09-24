import java.util.ArrayList;
import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        NotebookShelf shelf = new NotebookShelf();
        shelf.Add(getRandomNotebook());
        shelf.Add(getRandomNotebook());
        shelf.Add(getRandomNotebook());
        shelf.Add(getRandomNotebook());
        shelf.Add(getRandomNotebook());
        shelf.Add(getRandomNotebook());


        System.out.println("==================ALL======================");
        System.out.println(shelf);


        System.out.println("==========Filtered by Memory 120=====+=====");
        System.out.println("Filtered by Memory 120");
        var filteredNotebooks = shelf.FilterMemory(120);
        for (var notebook : filteredNotebooks) {
            System.out.println(notebook);
        }

        System.out.println("==========Filtered by OS===========");
        filteredNotebooks = shelf.FilterOS("Windows");
        for (var notebook : filteredNotebooks) {
            System.out.println(notebook);
        }
        }

    public static Notebook getRandomNotebook() {
        var random = new Random();
        var randomModel = Integer.toString(random.nextInt(100, 99999));
        var manufacturers = new ArrayList<String>(Arrays.asList("ASUS", "HP", "LENOVO", "MSI", "HUAWEI"));
        var operationSystems = new ArrayList<String>(Arrays.asList("Windows", "MAC", "LINUX"));
        var colors = new ArrayList<String>(Arrays.asList("Black", "White", "Gray", "Blue", "Red"));

        var notebook =  new Notebook(randomModel, manufacturers.get(random.nextInt(0, manufacturers.size())));
        notebook.setMemory(random.nextInt(1, 256));
        notebook.setHddSize(random.nextInt(200, 900900));
        notebook.setOs(operationSystems.get(random.nextInt(0, operationSystems.size())));
        notebook.setColor(colors.get(random.nextInt(0, colors.size())));
        return notebook;
    }




}