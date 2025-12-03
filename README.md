# Compilador Front-End — Pokémon
Um compilador (front-end) feito em **Java**, utilizando **JFlex** para análise léxica e **CUP** para análise sintática.  
A linguagem criada é inspirada em Pokémon, onde cada palavra-chave representa um token especial do compilador.

Este projeto implementa:
- Scanner (analisador léxico) usando **JFlex**  
- Parser (analisador sintático) usando **CUP**  
- Construção de **AST** completa  
- Suporte a funções, variáveis, operadores, if/else, while, for, print, expressões e tipos  
- Palavras-chave personalizadas (`poke`, `candy`, `MEW`, `SQUIRTLE`, etc.)

---

## Linguagem Pokémon

### **Tipos**
| Palavra | Significado real |
|--------|------------------|
| `poke` | `Int` |
| `candy` | `Float` |
| `PIKACHU` | `String` |

### **Estruturas**
| Pokémon | Palavra comum |
|---------|---------------|
| `MEW` | `if` |
| `MEWTWO` | `else` |
| `CHARMANDER` | `while` |
| `SQUIRTLE` | `for` |
| `ARCEUS` | `function` |
| `BULBASAUR` | `return` |
| `pokedex` | `print` |

---

# Como Rodar
```bash
git clone "https://github.com/LeonardoCMartins/Compilador-Java.git"
cd CompiladorFrontEnd-master
.\run.bat
```
> **Obs:** Se quiser testar outros códigos, basta editar o arquivo input.txt antes de rodar novamente o .\run.bat.
