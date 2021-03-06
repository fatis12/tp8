package cigma.pfe.services;

import cigma.pfe.models.Facture;

import java.util.List;

public interface IFactureCS {

    Facture create(Facture f);
    List<Facture> read();
    void delete(long id);
    Facture update(Facture f);
}