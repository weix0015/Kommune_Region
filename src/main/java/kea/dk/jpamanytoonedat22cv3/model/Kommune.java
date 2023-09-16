package kea.dk.jpamanytoonedat22cv3.model;

import jakarta.persistence.*;


@Entity
public class Kommune
{


    @Id
    private String kode;
    private String navn;
    private String href;



    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "region", referencedColumnName = "kode")
    Region region;

    public Kommune(String kode, String navn, String href, Region region) {
        this.kode = kode;
        this.navn = navn;
        this.href = href;
        this.region = region;
    }

    public Kommune() {

    }

    public String getKode()
    {
        return kode;
    }

    public void setKode(String kode)
    {
        this.kode = kode;
    }

    public String getNavn()
    {
        return navn;
    }

    public void setNavn(String navn)
    {
        this.navn = navn;
    }

    public String getHref()
    {
        return href;
    }

    public void setHref(String href)
    {
        this.href = href;
    }

    public Region getRegion()
    {
        return region;
    }

    public void setRegion(Region region)
    {
        this.region = region;
    }

}
