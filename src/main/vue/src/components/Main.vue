<template>
    <div id="content">
        <script type="application/javascript">
            $.fn.form.settings.rules.doubleRange = function (value, range) {
                let numberRegExp = $.fn.form.settings.regExp.number;
                let parts = range.split('..', 2);
                let min = parts[0] - 0;
                let max = parts[1] - 0;
                return value !== '' && numberRegExp.test(value) && value >= min && value <= max;
            };
            $(document).ready(function () {
                $('.ui.form').form({
                    fields: {
                        y: {
                            identifier: 'y',
                            rules: [
                                {
                                    type: 'empty',
                                    prompt: 'You can\'t leave coordinate y unset'
                                },
                                {
                                    type: 'doubleRange[-5..5]',
                                    prompt: 'Coordinate y must be a number between -5 and 5'
                                }
                            ]
                        }
                    },
                    onSuccess(e) {
                        e.preventDefault();
                    }
                });
            });
        </script>
        <div class="ui inverted vertical segment"
             style="padding: 8.5px; position: sticky; top: 0; margin-top: 0; z-index: 101; width: 100%;">
            <div class="ui large inverted secondary menu adaptive">
                <a class="active item">
                    <i class="home icon"></i>Home
                </a>
                <a class="item" href="/auth">
                    Auth
                </a>
                <div class="right menu">
                    <a class="item">
                        Logout&nbsp;<i class="sign-out icon"></i>
                    </a>
                </div>
            </div>
        </div>
        <form class="ui form adaptive">
            <div class="ui raised blue segment adaptive">
                <h2 class="ui header" style="text-align: center;">Graph</h2>
                <canvas id="canvas"/>
            </div>
            <div class="ui raised green segment adaptive">
                <h2 class="ui header" style="text-align: center;">Add point</h2>
                <h4 style="margin-top: 0;">Coordinate X</h4>
                <div class="field" style="display: inline-block; margin-right: 1em;margin-bottom: 19px;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" checked value="-4">
                        <label>-4</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="-3">
                        <label>-3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="-2">
                        <label>-2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="-1">
                        <label>-1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="0">
                        <label>0</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="1">
                        <label>1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="2">
                        <label>2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="3">
                        <label>3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0" value="4">
                        <label>4</label>
                    </div>
                </div>

                <h4 style="margin-top: 0;">Coordinate Y</h4>
                <div class="field">
                    <input type="text" name="y">
                </div>
                <h4 style="margin-top: 0;">Radius</h4>
                <div class="field" style="display: inline-block; margin-right: 1em; margin-bottom: 19px;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="-4">
                        <label>-4</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="-3">
                        <label>-3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="-2">
                        <label>-2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="-1">
                        <label>-1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="0">
                        <label>0</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="1">
                        <label>1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="2">
                        <label>2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" checked value="3">
                        <label>3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" value="4">
                        <label>4</label>
                    </div>
                </div>
                <button class="ui fluid large green button" style="text-align: center;" type="submit">
                    Submit
                </button>
            </div>
            <div class="ui error message"
                 style="border: 1px solid #E0B4B4; margin-bottom: 14px; box-shadow: rgba(159, 58, 56, 0.12) 0 2px 4px 0, rgba(159, 58, 56, 0.15) 0 2px 10px 0;"></div>
        </form>
        <div class="ui raised black segment adaptive">
            <h2 class="ui header" style="text-align: center;">History of results</h2>
            <div class="ui error message">
                Nothing to show: history is empty!
            </div>
            <table class="ui celled unstackable center aligned table adaptive">
                <thead>
                <tr>
                    <th>X</th>
                    <th>Y</th>
                    <th>R</th>
                    <th>Hit</th>
                    <th>Time</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Jamie</td>
                    <td>Unknown</td>
                    <td>Jamie</td>
                    <td class="positive"><i class="icon check"></i></td>
                    <td>Unknown</td>
                </tr>
                <tr>
                    <td>Jamie</td>
                    <td>Unknown</td>
                    <td>Jamie</td>
                    <td class="negative"><i class="icon close"></i></td>
                    <td>Unknown</td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</template>

<script>
import $ from 'jquery';

//import axios from "axios";

function drawArea(r) {
    let canvas = document.getElementById('canvas');
    let context = canvas.getContext('2d');

    canvas.width = getComputedStyle(canvas).width.split('px')[0]; // получаем ширину canvas из его css ширины
    canvas.height = getComputedStyle(canvas).height.split('px')[0]; // получаем длину canvas из его css ширины
    canvas.width = Math.ceil(canvas.width * 2); // увеличиваем в 2 раза
    canvas.height = Math.ceil(canvas.height * 2); // увеличиваем в 2 раза
    context.scale(canvas.width / 264, canvas.height / 264); // увеличиваем масштаб, получаем более хорошее качество
    context.clearRect(0, 0, canvas.width, canvas.height); // очистка перед новой отрисовкой

    context.fillStyle = "black";
    context.lineWidth = 1;
    context.beginPath(); // оси
    context.moveTo(132.5, 0);
    context.lineTo(132.5, 264);
    context.moveTo(128, 6);
    context.lineTo(132.5, 0);
    context.moveTo(137, 6);
    context.lineTo(132.5, 0);
    context.moveTo(0, 132.5);
    context.lineTo(264, 132.5);
    context.moveTo(258, 137);
    context.lineTo(264, 132.5);
    context.moveTo(258, 128);
    context.lineTo(264, 132.5);
    context.stroke();

    context.font = "1em Lato"; // подписи осей
    context.fillText("Y", 120, 11);
    context.fillText("X", 255, 148);

    context.fillStyle = "#2185D0";
    if (r > 0) {
        context.fillRect(132.5 - r * 18 * 2 - 1.5, 133, r * 18 * 2 + 1, r * 18 * 2 + 1); // прямоугольник

        context.beginPath(); // треугольник
        context.moveTo(133, 132);
        context.lineTo(133 + r * 18 * 2 + 1.5, 132);
        context.lineTo(133, 132 - r * 18 - 1);
        context.lineTo(133, 132);
        context.fill();

        context.beginPath(); // круг
        context.arc(132, 132, r * 18 + 1, -Math.PI / 2, -Math.PI, true);
        context.lineTo(132, 132);
        context.fill();
    } else if (r < 0) {
        context.fillRect(134 - r * 18 * 2, 132, r * 18 * 2 - 1, r * 18 * 2 - 1); // прямоугольник

        context.beginPath(); // треугольник
        context.moveTo(132, 133);
        context.lineTo(132 + r * 18 * 2 - 1, 133);
        context.lineTo(132, 134 - r * 18);
        context.lineTo(132, 133);
        context.fill();

        context.beginPath(); // круг
        context.arc(133, 133, Math.abs(r) * 18 + 1, Math.PI / 2, 0, true);
        context.lineTo(133, 133);
        context.fill();
    }

    for (let i = 1; i <= 6; i++) {
        context.beginPath();
        context.moveTo(132.5 + i * 18 + 1, 130); // насечки по x вправо
        context.lineTo(132.5 + i * 18 + 1, 135);
        context.moveTo(132.5 - i * 18 - 1, 130); // насечки по x влево
        context.lineTo(132.5 - i * 18 - 1, 135);
        context.moveTo(130, 132.5 + i * 18 + 1); // насечки по y вниз
        context.lineTo(135, 132.5 + i * 18 + 1);
        context.moveTo(130, 132.5 - i * 18 - 1); // насечки по y вверх
        context.lineTo(135, 132.5 - i * 18 - 1);
        context.stroke();
    }

    context.fillStyle = "black";
    if (r > 0) {
        context.fillText("R", 120, 132.5 - Math.abs(r) * 18 * 2 + 2); // R по y
        context.fillText("R", 120, 132.5 + Math.abs(r) * 18 * 2 + 4);
    } else {
        context.fillText("R", 122, 145);
    }
    if (Math.abs(r) > 1) {
        context.fillText("0.5R", 120 - 19, 132.5 - Math.abs(r) * 18 + 2); // 0.5R по y
        context.fillText("0.5R", 120 - 19, 132.5 + Math.abs(r) * 18 + 4);
    }
    if (r > 0) {
        context.fillText("R", 132.5 - Math.abs(r) * 18 * 2 - 5, 148); // R по x
        context.fillText("R", 132.5 + Math.abs(r) * 18 * 2 - 3, 148);
    }
    if (Math.abs(r) > 1) {
        context.fillText("0.5R", 132.5 - Math.abs(r) * 18 - 10, 148); // 0.5R по x
        context.fillText("0.5R", 132.5 + Math.abs(r) * 18 - 8, 148);
    }

    canvas.addEventListener('mouseup', function (e) {
        let x = e.pageX - e.target.offsetLeft;
        let y = e.pageY - e.target.offsetTop;

        if (canvas.width / 2 === 264) {
            $('x').value = ((x - 504) / 36).toFixed(1);
            $('y').value = ((y - 243) / -36).toFixed(1);
            console.log('x = ' + ((x - 504) / 36).toFixed(1));
            console.log('y = ' + ((y - 243) / -36 - 0.015).toFixed(1));

            context.fillStyle = '#FF0000';
            context.font = "21px Lato";
            context.fillText(".", x - 382, y - 110);
            //context.fillRect(x * 36 + 504 - 1.5, y * -36 + 243 - 2, 2, 2);
        } else {
            $('x').value = ((x - 115) / 26).toFixed(1);
            $('y').value = ((y - 172) / -26).toFixed(1);
            console.log('x = ' + ((x - 114) / 26 + 0.01).toFixed(1));
            console.log('y = ' + ((y - 172) / -26).toFixed(1));

            context.fillStyle = '#FF0000';
            context.font = "21px Lato";
            context.fillText(".", x + 16, y - 30);
        }
        //$('form').submit();
    });

    //drawPointsFromHistory(); // заполняем точки из истории
}

export default {
    mounted() {
        let list = $('input[name=r]');
        for (let i = 0; i < list.length; i++) {
            let radio = list[i];
            radio.onclick = function () {
                drawArea(radio.value);
            };
        }
        drawArea(3);
    }
}
</script>