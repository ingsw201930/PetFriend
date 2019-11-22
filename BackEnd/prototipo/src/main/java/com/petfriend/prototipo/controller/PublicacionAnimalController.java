package com.petfriend.prototipo.controller;

import java.util.ArrayList;
import java.util.List;

import com.petfriend.prototipo.model.Animal;
import com.petfriend.prototipo.model.Filtros;
import com.petfriend.prototipo.model.Publicacion;
import com.petfriend.prototipo.model.PublicacionAdopcion;
import com.petfriend.prototipo.model.PublicacionAnimal;
import com.petfriend.prototipo.model.PublicacionServicio;
import com.petfriend.prototipo.repositories.IPublicacionAEncontradoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAPerdidoRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionAdopcionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionRepositorio;
import com.petfriend.prototipo.repositories.IPublicacionServicioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class PublicacionAnimalController {

    @Autowired
    private IPublicacionAdopcionRepositorio<PublicacionAdopcion> pubAnimalAdopRepo;
    @Autowired
    private IPublicacionAPerdidoRepositorio animalPerdRepo;
    @Autowired
    private IPublicacionAEncontradoRepositorio animalEncRepo;
    @Autowired
    private IPublicacionServicioRepositorio servRepo;
    

    public Iterable<Publicacion> pedirPublicacionesAdopcion() {
        Iterable<PublicacionAnimal> aux = pubAnimalAdopRepo.findAll();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (PublicacionAnimal a : aux) {
			solution.add(a);
		}
        return solution;
    }
    public Iterable<Publicacion> pedirPublicacionesPerdido() {
        Iterable<PublicacionAnimal> aux = animalPerdRepo.findAll();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (PublicacionAnimal a : aux) {
			solution.add(a);
		}
        return solution;
        //System.out.println("jaja "+solution.size());
    }
    public Iterable<Publicacion> pedirPublicacionesEncontrado() {
        Iterable<PublicacionAnimal> aux = animalEncRepo.findAll();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (PublicacionAnimal a : aux) {
			solution.add(a);
		}
        return solution;
    }
    public Iterable<Publicacion> pedirPublicacionesServicios()
    {
        Iterable<PublicacionServicio> aux = servRepo.findAll();
		List<Publicacion> solution = new ArrayList<Publicacion>();
		for (PublicacionServicio a : aux) {
			solution.add(a);
		}
        return solution;
    }
    
    public Iterable<Publicacion> pedirPublicacionesAdopcionFiltros(final Filtros filtros) {
        List<Animal> auxAnimal=new ArrayList<>();
        List<PublicacionAnimal> auxAn=(List<PublicacionAnimal>) pubAnimalAdopRepo.findAll();
        for(PublicacionAnimal pAn: auxAn)
        {
            auxAnimal.add(pAn.getAnimal());    
        }
        if(filtros.getColor1()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getColor1().equalsIgnoreCase(filtros.getColor1()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        if(filtros.getColor2()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getColor2().equalsIgnoreCase(filtros.getColor2()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        if(filtros.getEdad()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEdad().equalsIgnoreCase(filtros.getEdad()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        if(filtros.getEsterilizado()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!(auxAnimal.get(i).getEsterilizado()==filtros.getEsterilizado()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 4  _________________________________");
        if(filtros.getRaza()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getRaza().equalsIgnoreCase(filtros.getRaza()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 5  _________________________________");
        if(filtros.getSexo()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                //System.out.println(" sexo: "+auxAnimal.get(i).getRaza());
                if(!auxAnimal.get(i).getSexo().equals(filtros.getSexo().charAt(0)))
                {
                    //System.out.println("elmina");
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 6  _________________________________");
        if(filtros.getEspecie()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEspecie().equalsIgnoreCase(filtros.getEspecie()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 7  _________________________________");
        List<Publicacion> solution = new ArrayList<Publicacion>();
        for(PublicacionAnimal pAn: auxAn)
        {
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(pAn.getAnimal().getIdAnimal()==auxAnimal.get(i).getIdAnimal())
                    solution.add(pAn);
            }
                
        }
        return solution;
    }
    public Iterable<Publicacion> pedirPublicacionesEncontradoFiltros(final Filtros filtros){
        List<Animal> auxAnimal=new ArrayList<>();
        //System.out.println("entra 2"+filtros.getEspecie());
        //Iterable<Animal> au=animalRepo.findAllByEspecie("Canino");
        //System.out.println(" kaka "+au.toString());
        //System.out.println("al menos");
        //System.out.println(" llega 10! "+filtros.getColor1());
        List<PublicacionAnimal> auxAn=(List<PublicacionAnimal>) animalEncRepo.findAll();
        for(PublicacionAnimal pAn: auxAn)
        {
            auxAnimal.add(pAn.getAnimal());    
        }
        if(filtros.getColor1()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                //System.out.println(" v "+auxAnimal.get(i).getColor1()+" c "+filtros.getColor1()+" id "+ auxAnimal.get(i).getIdAnimal());
                if(!auxAnimal.get(i).getColor1().equalsIgnoreCase(filtros.getColor1()))
                {
                    //System.out.println("elimina");
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 1  _________________________________");
        if(filtros.getColor2()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getColor2().equalsIgnoreCase(filtros.getColor2()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 2  _________________________________");
        if(filtros.getEdad()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEdad().equalsIgnoreCase(filtros.getEdad()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 3  _________________________________");
        if(filtros.getEsterilizado()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!(auxAnimal.get(i).getEsterilizado()==filtros.getEsterilizado()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 4  _________________________________");
        if(filtros.getRaza()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getRaza().equalsIgnoreCase(filtros.getRaza()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 5  _________________________________");
        if(filtros.getSexo()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                //System.out.println(" sexo: "+auxAnimal.get(i).getRaza());
                if(!auxAnimal.get(i).getSexo().equals(filtros.getSexo().charAt(0)))
                {
                    //System.out.println("elmina");
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 6  _________________________________");
        if(filtros.getEspecie()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEspecie().equalsIgnoreCase(filtros.getEspecie()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 7  _________________________________");
        List<Publicacion> solution = new ArrayList<Publicacion>();
        for(PublicacionAnimal pAn: auxAn)
        {
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(pAn.getAnimal().getIdAnimal()==auxAnimal.get(i).getIdAnimal())
                    solution.add(pAn);
            }
                
        }
        return solution;
    }
    public Iterable<Publicacion> pedirPublicacionesPerdidoFiltros(final Filtros filtros) {
        List<Animal> auxAnimal=new ArrayList<>();
        //System.out.println("entra 2"+filtros.getEspecie());
        //Iterable<Animal> au=animalRepo.findAllByEspecie("Canino");
        //System.out.println(" kaka "+au.toString());
        //System.out.println("al menos");
        //System.out.println(" llega 10! "+filtros.getColor1());
        List<PublicacionAnimal> auxAn=(List<PublicacionAnimal>) animalPerdRepo.findAll();
        for(PublicacionAnimal pAn: auxAn)
        {
            auxAnimal.add(pAn.getAnimal());    
        }
        if(filtros.getColor1()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                //System.out.println(" v "+auxAnimal.get(i).getColor1()+" c "+filtros.getColor1()+" id "+ auxAnimal.get(i).getIdAnimal());
                if(!auxAnimal.get(i).getColor1().equalsIgnoreCase(filtros.getColor1()))
                {
                    //System.out.println("elimina");
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 1  _________________________________");
        if(filtros.getColor2()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getColor2().equalsIgnoreCase(filtros.getColor2()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 2  _________________________________");
        if(filtros.getEdad()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEdad().equalsIgnoreCase(filtros.getEdad()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 3  _________________________________");
        if(filtros.getEsterilizado()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!(auxAnimal.get(i).getEsterilizado()==filtros.getEsterilizado()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 4  _________________________________");
        if(filtros.getRaza()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getRaza().equalsIgnoreCase(filtros.getRaza()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 5  _________________________________");
        if(filtros.getSexo()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                //System.out.println(" sexo: "+auxAnimal.get(i).getRaza());
                if(!auxAnimal.get(i).getSexo().equals(filtros.getSexo().charAt(0)))
                {
                    //System.out.println("elmina");
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 6  _________________________________");
        if(filtros.getEspecie()!=null)
        {
            List<Integer> nums=new ArrayList<>();
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(!auxAnimal.get(i).getEspecie().equalsIgnoreCase(filtros.getEspecie()))
                {
                    nums.add(i);
                }
            }
            for(int i=nums.size()-1; i>=0; i--)
            {
                auxAnimal.remove((int)nums.get(i));
            }
        }
        
        //System.out.println("entra 7  _________________________________");
        List<Publicacion> solution = new ArrayList<Publicacion>();
        for(PublicacionAnimal pAn: auxAn)
        {
            for(int i=0; i<auxAnimal.size(); i++)
            {
                if(pAn.getAnimal().getIdAnimal()==auxAnimal.get(i).getIdAnimal())
                    solution.add(pAn);
            }
                
        }
        return solution;
    }
}