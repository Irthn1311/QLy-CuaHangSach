package Book;
public class Tacgia{
    private String matacgia;
    private String tentacgia;
    private int namsinh;
    private String quequan;
    public Tacgia(){
        matacgia="";
        tentacgia="";
        namsinh=0;
        quequan="";
    }
    public Tacgia(String matacgia,String tentacgia,int namsinh,String quequan){
        this.matacgia=matacgia;
        this.tentacgia=tentacgia;
        this.namsinh=namsinh;
        this.quequan=quequan;
    }
    public String getMatacgia(){
        return matacgia;
    }
    public String getTentacgia(){
        return tentacgia;
    }
    public int getNamsinh(){
        return namsinh;
    }
    public String getQuequan(){
        return quequan;
    }
    public void setMatacgia(String matacgia ){
        this.matacgia=matacgia;
    }
    public void setTentacgia(String tentacgia){
        this.tentacgia=tentacgia;
    }
    public void setNamsinh(int namsinh){
        this.namsinh=namsinh;
    }
    public void setQuequan(String quequan){
        this.quequan=quequan;
    }
}
