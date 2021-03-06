package guru.springframwork.sfgpetclinic.bootStrap;

import guru.springframwork.sfgpetclinic.model.Owner;
import guru.springframwork.sfgpetclinic.model.Vet;
import guru.springframwork.sfgpetclinic.services.OwnerService;
import guru.springframwork.sfgpetclinic.services.VetService;
import guru.springframwork.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframwork.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;


    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {



            Owner owner1 = new Owner();

            owner1.setFirstName("Michael");
            owner1.setLastName("Weston");

            ownerService.save(owner1);

            Owner owner2 = new Owner();
            owner2.setFirstName("Fiona");
            owner2.setLastName("Glenanne");


            ownerService.save(owner2);

            System.out.println("Loaded Owners....");

            Vet vet1 = new Vet();
            vet1.setFirstName("Sam");
            vet1.setLastName("Axe");

            vetService.save(vet1);

            Vet vet2 = new Vet();
            vet2.setFirstName("Jessie");
            vet2.setLastName("Porter");

            vetService.save(vet2);

            System.out.println("Loaded Vets....");



    }
}
