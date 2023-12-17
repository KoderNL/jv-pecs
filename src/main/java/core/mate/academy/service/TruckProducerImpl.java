package core.mate.academy.service;

import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducerImpl implements MachineProducer<Machine> {

    @Override
    public List<Machine> get() {
        return List.of(new Truck(), new Truck());
    }
}
