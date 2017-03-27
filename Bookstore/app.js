var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');

//Ahora usamos los modelos de entidades creados
Genero = require('./models/genero');
Libro = require('./models/libro');

//Conectandonos a la Base de Datos
mongoose.connect('mongodb://localhost/bookstore');
var db = mongoose.connection;

app.get('/', function(req, res){
    res.send('Hola mundo!');
});

app.get('/api/v1/libros' ,function(req, res){
  Libro.getLibros(function(err, libros){
    if (err){
      throw err;
    }
    res.json(libros);
  });

});

app.get('/api/v1/generos' ,function(req, res){
  Genero.getGeneros(function(err, generos){
    if (err){
      throw err;
    }
    res.json(generos);
  });
});


app.listen(3000);
console.log('En ejecucion desde el puerto 3000');
