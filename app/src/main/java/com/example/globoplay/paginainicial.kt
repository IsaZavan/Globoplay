package com.example.globoplay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class paginainicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paginainicial)

        val napoleao = findViewById<ImageView>(R.id.napoleao)
        val avatar = findViewById<ImageView>(R.id.avatar)
        val aquaman = findViewById<ImageView>(R.id.aquaman)
        val teenwolf = findViewById<ImageView>(R.id.teenwolf)
        val b99 = findViewById<ImageView>(R.id.brooklyn99)
        val barbie = findViewById<ImageView>(R.id.barbie)
        val oppe = findViewById<ImageView>(R.id.oppenheimer)
        val luga = findViewById<ImageView>(R.id.lugares)

        napoleao.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.napoleao)
                putExtra("titulo", "NAPOLEÃO")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "As origens do comandante militar Napoleão e sua rápida ascensão. Uma visão através do prisma de seu relacionamento e muitas vezes volátil com sua esposa e por ser amor verdadeiro, Josephine."
                )
                putExtra("tituloorig", "Napoleon")
                putExtra("genero", "Aventura, Biopic, Histórico, Guerra")
                putExtra("ano", "2023")
                putExtra("pais", "Valetta, Malta")
                putExtra("direcao", "Ridley Scott")
                putExtra(
                    "elenco",
                    "Joaquin Phoenix, Vanessa Kirby,         Tahar Rahim, Ben, Ludivine Sagnier,         John HollingworthYoussef Kerkour,         Phil Cornwell, Ian McNeice,         Rupert Everett, Paul Rhys, Catherine Walker,         Gavin Spokes, Mark Bonnar, Anna Mawn,         Davide Tucci  Sam Crane, Scott Handy"
                )
            }
            startActivity(intent)
        }
        avatar.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.avatar)
                putExtra("titulo", "AVATAR")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "No exuberante mundo alienígena de Pandora vivem os Na'vi, seres que parecem ser primitivos, mas são altamente evoluídos. Como o ambiente do planeta é tóxico, foram criados os avatares, corpos biológicos controlados pela mente humana que se movimentam livremente em Pandora."
                )
                putExtra("tituloorig", "Avatar")
                putExtra("genero", "Ação, Ficção cientifica")
                putExtra("ano", "2009")
                putExtra("pais", "Nova Zelândia")
                putExtra("direcao", "James Cameron")
                putExtra(
                    "elenco",
                    "Sam Worthington, Jake Sully, Tommy, Jake Sully, Sigourney Weaver, Grace Augustine Kate Winslet Ronal, Ronal Michelle Rodriguez, Trudy Chacon, Stephen Lang"
                )
            }

            startActivity(intent)
        }
        aquaman.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.aquaman)
                putExtra("titulo", "AQUAMAN")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "A cidade de Atlantis, que já foi lar de uma das mais avançadas civilizações do mundo, agora é um reino submerso dominado pelo ganancioso Rei Orm. Com um vasto exército a seu dispor, Orm planeja conquistar tanto os demais reinos do oceano, quanto o mundo da superfície."
                )
                putExtra("tituloorig", "Aquaman")
                putExtra("genero", "Ação, Ficção cientifica")
                putExtra("ano", "2018")
                putExtra("pais", "Reino Unido, Havaí e Los Angeles.")
                putExtra("direcao", "James Wan")
                putExtra(
                    "elenco",
                    "Jason Momoa, Amber Heard, Patrick Wilson, Nicole Atlanna, Willem Dafo, Dolph Lundgren, Randall Park Stephen Shin"
                )
            }

            startActivity(intent)
        }
        teenwolf.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.teenwolf)
                putExtra("titulo", "TEEN WOLF")
                putExtra("tipo", "Serie")
                putExtra(
                    "Enredo",
                    "O jovem Scott McCall (Tyler Posey) é estudante do ensino médio no colégio fictício de Beacon Hills e vive como um garoto comum, passando por problemas naturais da juventude. Ao ir caminhar na floresta em busca de um suposto corpo morto, o menino é mordido por um lobisomem."
                )
                putExtra("tituloorig", "Teen Wolf")
                putExtra("genero", "Ação, Ficção cientifica")
                putExtra("ano", "2011")
                putExtra("pais", "Victoria, Canadá.")
                putExtra("direcao", "Jeff Davis")
                putExtra(
                    "elenco",
                    "Tyler Posey, Tyler Hoechlin, Dylan O'Brien, Crystal Reed, Holland Roden."
                )
            }

            startActivity(intent)
        }
        b99.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.broklyn)
                putExtra("titulo", "Brooklyn Nine-Nine")
                putExtra("tipo", "Serie")
                putExtra(
                    "Enredo",
                    "A série Brooklyn Nine-Nine é ambientada na 99ª Delegacia de Polícia de Nova York, no Brooklyn, acompanhando as maluquices do imaturo detetive Jake Peralta (Andy Samberg) e a relação que ele tem com o novo capitão, Ray Holt (Andre Braugher)."
                )
                putExtra("tituloorig", "Brooklyn Nine-Nine")
                putExtra("genero", "Comédia")
                putExtra("ano", "2013")
                putExtra("pais", "Sixth Avenue e Bergen Street.")
                putExtra("direcao", "Michael Schur")
                putExtra(
                    "elenco",
                    "Andre Braugher, Andy Samberg, Melissa Fumero, Stephanie Beatriz, Terry Crews."
                )
            }

            startActivity(intent)
        }
        barbie.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.barbie)
                putExtra("titulo", "Barbie")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "Barbie começa a ter pensamentos estranhos e sua aparência muda, então ela parte para o mundo real com Ken para tentar encontrar uma solução e voltar a ser uma boneca perfeita."
                )
                putExtra("tituloorig", "Barbie")
                putExtra("genero", "Drama")
                putExtra("ano", "2023")
                putExtra("pais", "Reino Unido.")
                putExtra("direcao", "Greta Gerwig")
                putExtra(
                    "elenco",
                    "Margot Robbie, Ryan Gosling, Will Ferrell, Emma Mackey, Simu Liu."
                )
            }

            startActivity(intent)
        }
        oppe.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.oppenheimer)
                putExtra("titulo", "Oppenheimer")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "O físico J. Robert Oppenheimer trabalha com uma equipe de cientistas durante o Projeto Manhattan, levando ao desenvolvimento da bomba atômica."
                )
                putExtra("tituloorig", "Oppenheimer")
                putExtra("genero", "Terror/Obra de Época")
                putExtra("ano", "2023")
                putExtra("pais", "Los Alamos.")
                putExtra("direcao", "Christopher Nolan")
                putExtra(
                    "elenco",
                    "Cillian Murphy, Florence Pugh, Robert Downey Jr., Emily Blunt, Matt Damon."
                )
            }

            startActivity(intent)
        }
        luga.setOnClickListener {
            val intent = Intent(this, filmes::class.java).apply {
                putExtra("id_img", R.drawable.pobres)
                putExtra("titulo", "Pobres Criaturas")
                putExtra("tipo", "Filme")
                putExtra(
                    "Enredo",
                    "A jovem Bella Baxter é trazida de volta à vida pelo cientista Dr. Godwin Baxter. Querendo ver mais do mundo, ela foge com um advogado e viaja pelos continentes. Livre dos preconceitos de sua época, Bella exige igualdade e libertação."
                )
                putExtra("tituloorig", "Pobres Criaturas")
                putExtra("genero", "Comédia/Ficção científica")
                putExtra("ano", "2023")
                putExtra("pais", "Estados Unidos")
                putExtra("direcao", "Yorgos Lanthimos")
                putExtra(
                    "elenco",
                    "Emma Stone, Mark Ruffalo, Willem Dafoe, Margaret Qualley, Ramy Youssef."
                )
            }

            startActivity(intent)
        }
    }
}
