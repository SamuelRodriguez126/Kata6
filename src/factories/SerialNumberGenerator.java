package factories;


public class SerialNumberGenerator {

    private static SerialNumberGenerator serialNumberGenerator = null;
    
    private Integer serialNumber = 0;
    
    private SerialNumberGenerator(){
        
    }
    
    public Integer next(){
        return this.serialNumber++;
    }
    
    public static SerialNumberGenerator getInstance(){
        if(serialNumberGenerator == null){
            serialNumberGenerator = new SerialNumberGenerator();
        }
        return serialNumberGenerator;
    }
}
