public class WriterFactory 
{
    private Boolean FirstInstance;

    WriterFactory() {
        
    }

    TimetableWriter getType() {
        return null;
    }



}

interface TimetableWriter {
    File write();
}

class TimetablePDF  {

    File write() {
        return null;
    }
}

class TimetableCSV  {

    File write() {
        return null;
    }
}

class TimetableImage  {

    File write() {
        return null;
    }
}