package Quarta_Feira_LEI_GrupoF.scheduleManagement;

public class JsonToCsvConverter {

    public static void convert(jsonFile jsonFile, String csvFilename) {
        csvFile csv = new csvFile(jsonFile.getList());
        csv.saveFile(csvFilename);
    }
}