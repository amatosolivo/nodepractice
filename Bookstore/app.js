var express = require('express');
var app = express();
var bodyParser = require('body-parser');
var mongoose = require('mongoose');

//Inicializador del BodyParser jpara poder usar el POST method
app.use(bodyParser.json());

//Ahora usamos los modelos de entidades creados
Genero = require('./models/genero');
Libro = require('./models/libro');

//Conectandonos a la Base de Datos
mongoose.connect('mongodb://localhost/bookstore');
var db = mongoose.connection;

app.get('/', function(req, res){
    res.send('Hola mundo!');
});

//GET ALL LIBROS
app.get('/api/v1/libros' ,function(req, res){
  Libro.getLibros(function(err, libros){
    if (err){
      throw err;
    }
    res.json(libros);
  });

});

//GET LIBRO por ID
app.get('/api/v1/libros/:_id', function(req, res){
  Libro.getLibroPorId(req.params._id, function(err, libro){
    if (err){
      throw err;
    }
    res.json(libro);
  });
});

//GET ALL Generos
app.get('/api/v1/generos' ,function(req, res){
  Genero.getGeneros(function(err, generos){
    if (err){
      throw err;
    }
    res.json(generos);
  });
});

//ADD Genero
app.post('/api/v1/generos', function(req, res){
  var genero  = req.body;
  Genero.addGenero(genero, function(err, genero){
    if (err){
      throw err;
    }
    res.json(genero);
  });
});

//UPDATE Genero
app.put('/api/v1/generos/:_id', function(req, res){
  var id = req.params._id;
  var genero  = req.body;
  Genero.updateGenero(id, genero, {}, function(err, genero){
    if (err){
      throw err;
    }
    res.json(genero);
  });
});


//CONFIGURACION DEL SERVER
app.listen(3000);
console.log('En ejecucion desde el puerto : 3000');
