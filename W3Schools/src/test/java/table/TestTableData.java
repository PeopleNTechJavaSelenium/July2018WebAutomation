package table;

import org.testng.annotations.Test;
import tableData.ReadTableData;

import reporting.TestLogger;

public class TestTableData extends ReadTableData{

    @Test
    public void read(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        readData();
    }
}