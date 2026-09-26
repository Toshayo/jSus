package com.github.NeRdTheNed.jSus.result.printer;

import java.io.PrintWriter;
import java.util.Map;

import tools.jackson.databind.ObjectMapper;
import com.github.NeRdTheNed.jSus.result.ArchiveScanResults;

public class JSONPrinter extends Printer {

    public JSONPrinter(Map<String, ArchiveScanResults> scanResults) {
        super(scanResults);
    }

    public JSONPrinter(String archiveName, ArchiveScanResults scanResult) {
        super(archiveName, scanResult);
    }

    @Override
    public void print(PrintWriter writer) {
        final String jsonString = new ObjectMapper().writeValueAsString(scanResults);
        writer.write(jsonString);
    }

}
