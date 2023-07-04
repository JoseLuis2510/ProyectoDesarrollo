
package com.ProyectoDesarrollo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

   
    final String BucketName = "proyecto-90acd.appspot.com";

    
    final String rutaSuperiorStorage = "proyecto";

  
    final String rutaJsonFile = "firebase";
    
    
    final String archivoJsonFile = "proyecto-90acd-firebase-adminsdk-e891a-d860522198.json";
}

