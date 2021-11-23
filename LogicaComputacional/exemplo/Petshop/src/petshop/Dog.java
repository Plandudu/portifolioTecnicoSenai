package petshop;

public class Dog extends Animal{
    private String porte;
    private String raca;
    private Boolean focinheira;

    /**
     * @return the porte
     */
    public String getPorte() {
        return porte;
    }

    /**
     * @param porte the porte to set
     */
    public void setPorte(String porte) {
        this.porte = porte;
    }

    /**
     * @return the raca
     */
    public String getRaca() {
        return raca;
    }

    /**
     * @param raca the raca to set
     */
    public void setRaca(String raca) {
        this.raca = raca;
    }

    /**
     * @return the focinheira
     */
    public Boolean getFocinheira() {
        return focinheira;
    }

    /**
     * @param focinheira the focinheira to set
     */
    public void setFocinheira(Boolean focinheira) {
        this.focinheira = focinheira;
    }
    
    
}
