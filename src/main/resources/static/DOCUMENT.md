### Para ativar uma tag específica em uma lista não ordenada (ul) e aplicar um estilo à tag selecionada, você pode usar JavaScript para adicionar uma classe CSS à tag selecionada. Aqui está um exemplo de como você pode fazer isso:

HTML:

```html

<ul id="menu">
  <li onclick="activateTag(0)">Tag 1</li>
  <li onclick="activateTag(1)">Tag 2</li>
  <li onclick="activateTag(2)">Tag 3</li>
</ul>
```
CSS:

```css
.active {
    color: red;
}
```

JavaScript:

```javascript

  function activateTag(index) {
    // Remove a classe "active" de todas as tags
    var tags = document.querySelectorAll('#menu li');
    tags.forEach(function(tag) {
    tag.classList.remove('active');
    });
    
    // Adiciona a classe "active" à tag selecionada
    tags[index].classList.add('active');
  }
```


Neste exemplo, cada item da lista possui um evento onclick que chama a função activateTag() com o índice do item como parâmetro. A função remove a classe "active" de todos os itens da lista e, em seguida, adiciona a classe "active" ao item selecionado.

Quando a classe "active" é aplicada a um item, o estilo CSS definido será ativado, alterando a cor do texto para vermelho (ou qualquer outra cor definida no seu CSS).

Lembre-se de ajustar o código HTML, CSS e JavaScript de acordo com a estrutura do seu projeto e as classes e IDs utilizados.

OU

### Se você deseja usar um loop forEach para adicionar a classe "active" à tag selecionada em uma lista não ordenada (ul), você pode fazer assim:

HTML:

```html

<ul id="menu">
  <li>Tag 1</li>
  <li>Tag 2</li>
  <li>Tag 3</li>
</ul>
```
CSS:

```css
.active {
color: red;
}
```

JavaScript:

```javascript

var tags = document.querySelectorAll('#menu li');

tags.forEach(function(tag) {
tag.addEventListener('click', function() {
// Remove a classe "active" de todas as tags
tags.forEach(function(tag) {
tag.classList.remove('active');
});

    // Adiciona a classe "active" à tag selecionada
    this.classList.add('active');
});
});
```
Neste exemplo, utilizamos o método querySelectorAll para obter todas as tags li dentro da lista ul com o ID "menu". Em seguida, aplicamos um loop forEach para adicionar um evento de clique a cada tag.

Quando uma tag é clicada, a função de callback é acionada. Ela remove a classe "active" de todas as tags da lista e, em seguida, adiciona a classe "active" apenas à tag selecionada.

Dessa forma, ao clicar em uma tag, a cor do texto será alterada para vermelho (ou qualquer outra cor definida no CSS), indicando que a tag está ativa.