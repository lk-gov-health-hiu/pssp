/*
 * To change this license header, choose License Headers in Client Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.gov.health.phsp.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author buddhika
 */
@Entity
@XmlRootElement
public class ClientEncounterComponent extends Component {

    
    @ManyToOne(fetch = FetchType.LAZY)
    private Encounter encounter;

    @ManyToOne(fetch = FetchType.LAZY)
    private Client client;

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
