package dev.xmroot.comercio;

import org.bukkit.Material;

public enum Vendas {
    APPLE(Material.getMaterial(Strings.Itemvender1), 30000);

    private Material material;
    private double valor;
    private Vendas(Material material, double valor) {
        this.material = material;
        this.valor = valor;
    }
    public Material getMaterial() {
        return material;
    }
    public void setMaterial(Material material) {
        this.material = material;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
}
