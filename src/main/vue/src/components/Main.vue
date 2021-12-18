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
                        <input type="radio" name="x" tabindex="0" checked>
                        <label>-4</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>-3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>-2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>-1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>0</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="x" tabindex="0">
                        <label>4</label>
                    </div>
                </div>

                <h4 style="margin-top: 0;">Coordinate Y</h4>
                <div class="field">
                    <input type="text" name="y" placeholder="0">
                </div>
                <h4 style="margin-top: 0;">Radius</h4>
                <div class="field" style="display: inline-block; margin-right: 1em; margin-bottom: 19px;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0" checked>
                        <label>-4</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>-3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>-2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>-1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>0</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>1</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>2</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block; margin-right: 1em;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
                        <label>3</label>
                    </div>
                </div>
                <div class="field" style="display: inline-block;">
                    <div class="ui radio checkbox">
                        <input type="radio" name="r" tabindex="0">
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
    </div>
</template>

<script>
//import axios from "axios";
export default {
    methods: {
        drawArea(r) {
            let canvas = document.getElementById('canvas');
            let context = canvas.getContext('2d');

            canvas.width = getComputedStyle(canvas).width.split('px')[0];
            canvas.height = getComputedStyle(canvas).height.split('px')[0];
            canvas.width = Math.ceil(canvas.width * 2); // increase canvas width
            canvas.height = Math.ceil(canvas.height * 2); // increase canvas height
            context.scale(canvas.width / 264, canvas.height / 264); // change canvas scale, now quality is better

            context.clearRect(0, 0, canvas.width, canvas.height);
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
            context.fillRect(132.5 - r * 18 * 2 - 1.5, 133, r * 18 * 2 + 1, r * 18 * 2 + 1); // прямоугольник

            context.beginPath(); // треугольник
            context.moveTo(133, 132);
            context.lineTo(133 + r * 18 * 2 + 1.5, 132);
            context.lineTo(133, 132 - r * 18);
            context.lineTo(133, 132);
            context.fill();

            context.beginPath(); // круг
            context.arc(131.5, 132, r * 18, -Math.PI / 2, -Math.PI, true);
            context.lineTo(132, 132);
            context.lineTo(132, 132 - r * 18);
            context.fill();

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

            context.fillText("R", 120, 132.5 - r * 18 * 2 + 2); // R по y
            if (r !== 1) {
                context.fillText("0.5R", 120 - 19, 132.5 - r * 18 + 2);
                context.fillText("0.5R", 120 - 19, 132.5 + r * 18 + 4);
            }
            context.fillText("R", 120, 132.5 + r * 18 * 2 + 4);

            context.fillText("R", 132.5 - r * 18 * 2 - 5, 148); // R по x
            if (r !== 1) {
                context.fillText("0.5R", 132.5 - r * 18 - 10, 148);
                context.fillText("0.5R", 132.5 + r * 18 - 8, 148);
            }
            context.fillText("R", 132.5 + r * 18 * 2 - 3, 148);

            //drawPointsFromHistory(); // заполняем точки из истории
        }
    },
    mounted() {
        this.drawArea(3);
    }
}
</script>