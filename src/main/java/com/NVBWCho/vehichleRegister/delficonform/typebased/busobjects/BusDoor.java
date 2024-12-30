package com.NVBWCho.vehichleRegister.delficonform.typebased.busobjects;



import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.Linebus;
import com.NVBWCho.vehichleRegister.delficonform.typebased.bustypes.doortypes.BusDoorType;
import jakarta.persistence.*;

@Entity
@Table(name="busdoor")
public class BusDoor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column

    private Long id;


    @ManyToOne
    @JoinColumn(name="busdoortype_id")

    private BusDoorType busDoorType;

    public Linebus getLinebus() {
        return linebus;
    }

    public void setLinebus(Linebus linebus) {
        this.linebus = linebus;
    }

    @ManyToOne
    @JoinColumn(name="linebus_id")
    private Linebus linebus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BusDoorType getBusDoorType() {
        return busDoorType;
    }

    public void setBusDoorType(BusDoorType busDoorType) {
        this.busDoorType = busDoorType;
    }

    @Override
    public String toString() {
        return "BusDoor{" +
                "busDoorType=" + busDoorType +
                '}';
    }
}
