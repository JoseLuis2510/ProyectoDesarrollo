
package com.ProyectoDesarrollo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

   
    final String BucketName = "proyectodesarrollo-92ab6.appspot.com";

    
    final String rutaSuperiorStorage = "proyecto";

  
    final String rutaJsonFile = "firebase";
    
    
    final String archivoJsonFile = "proyectodesarrollo-92ab6-firebase-adminsdk-mlmw0-82b25d72e3.json";
}

