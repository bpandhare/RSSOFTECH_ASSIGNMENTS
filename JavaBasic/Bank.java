public class Bank{
    
   private int bankId;
   private String name;
   private String branch;
   private String ifscCode;
   private String totalAssets;
 
  public Bank(){
      
       }
 
  public Bank(int bankId, String name,String branch, String ifscCode, String totalAssets){
     
       this.bankId=bankId;
       this.name =name;
       this.branch =branch;
       this.ifscCode = ifscCode; 
       this.totalAssets = totalAssets;
       }
  
    public int getbankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId =bankId;
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name =name;
    }
    
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch =branch;
    }
    
    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }
    
     public String getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(String totalAssets) {
        this.totalAssets = totalAssets;
    }

@Override
    public String toString(){
            return "Bank [bankId=" + bankId + ", name=" + name + ", branch=" + branch +
                ",ifscCode=" +ifscCode + ", totalAssets=" + totalAssets+ "]";
    }

}