import java.util.*;

public class NotebookShelf {
    private List<Notebook> notebooks = new ArrayList<>();

    public List<Notebook> FilterMemory(Integer Memory) {
        return Filter(Memory, null, null, null);
    }

    public List<Notebook> FilterHDD(Integer HDDSize) {
        return Filter(null, HDDSize, null, null);
    }

    public List<Notebook> FilterOS(String OS) {
        return Filter(null, null, OS, null);
    }

    public List<Notebook> FilterColor(String Color) {
        return Filter(null, null, null, Color);
    }

    private List<Notebook> Filter(Integer Memory, Integer HDDSize, String OS, String Color) {
        var filteredNotebooks = new ArrayList<Notebook>(notebooks);

        if (Memory != null) {
            var tempList = new ArrayList<Notebook>();
            for (var notebook : filteredNotebooks) {
                if (notebook.getMemory() >= Memory) {
                    tempList.add(notebook);
                }
            }
            filteredNotebooks = tempList;
        }

        if (HDDSize != null) {
            var tempList = new ArrayList<Notebook>();
            for (var notebook : filteredNotebooks) {
                if (notebook.getHddSize() >= HDDSize) {
                    tempList.add(notebook);
                }
            }
            filteredNotebooks = tempList;
        }

        if (OS != null) {
            var tempList = new ArrayList<Notebook>();
            for (var notebook : filteredNotebooks) {
                if (notebook.getOs().equals(OS)) {
                    tempList.add(notebook);
                }
            }
            filteredNotebooks = tempList;
        }

        if (Color != null) {
            var tempList = new ArrayList<Notebook>();
            for (var notebook : filteredNotebooks) {
                if (notebook.getColor().equals(Color)) {
                    tempList.add(notebook);
                }
            }
            filteredNotebooks = tempList;
        }

        return filteredNotebooks;
    }

    public void Add(Notebook notebook) {
        this.notebooks.add(notebook);
    }

    @Override
    public String toString() {
        var tempList = new ArrayList<String>();
        for (var notebook : notebooks) {
            tempList.add(notebook.toString());
        }
        return String.join("\n", tempList);
    }
}
