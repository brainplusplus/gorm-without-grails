package demo.GORMwithoutGrails.service

import demo.GORMwithoutGrails.domain.Vehicle
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service('vehicleService')
@Transactional
class VehicleServiceImpl implements VehicleService {

    @Transactional(readOnly = true)
    @Override
    List<Vehicle> list() {
        Vehicle.list()
    }
}
