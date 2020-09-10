package workbook;

import java.util.List;

public final class SortInputBuilder {
    String file;
    String filePath;
    String stringInput;
    List<Object> list;

    private SortInputBuilder() {
    }

    public static SortInputBuilder BuildSortInput() {
        return new SortInputBuilder();
    }

    public SortInputBuilder withFile(String file) {
        this.file = file;
        return this;
    }

    public SortInputBuilder withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    public SortInputBuilder withStringInput(String stringInput) {
        this.stringInput = stringInput;
        return this;
    }

    public SortInputBuilder withList(List<Object> list) {
        this.list = list;
        return this;
    }

    public SortInput build() {
        SortInput sortInput = new SortInput();
        sortInput.setFile(file);
        sortInput.setFilePath(filePath);
        sortInput.setStringInput(stringInput);
        sortInput.setList(list);
        return sortInput;
    }

/*    private String buildFilPath() {

    }*/
}
