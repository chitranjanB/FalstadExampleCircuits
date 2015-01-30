
public class ImportExportDialogFactory {

    public static ImportExportDialog Create(CirSim f,
            ImportExportDialog.Action type) {
        return new ImportExportFileDialog(f, type);
    }
}
