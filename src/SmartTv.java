public class SmartTv {
    public boolean estado = false;
    public int volume = 0;

    public boolean ligarTv() {
        return estado = true;
    }
    public boolean desligarTv() {
        return estado = false;
    }

    public void aumentarVolume() {
        if (volume < 100)
            volume++;
        else
            volume = volume;
    }
    public void diminuirVolume() {
        if (volume > 0)
            volume--;
        else
            volume = volume;
    }

    public void exibirInformacoes() {
        if (estado == true)
            System.out.printf("Estado da tv: Ligada \nVolume Atual: %d", volume);
        else
            System.out.printf("Estado da tv: Desligada \nVolume Atual: %d", volume);
    }

    public void SmartTv(boolean estado,int volume) {
        this.estado = estado;
        this.volume = volume;
    }


}
