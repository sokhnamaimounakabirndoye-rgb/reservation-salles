package sn.woy.reservation.domain;

public abstract class AbstractEntity {

    private Long id;

    protected AbstractEntity(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}