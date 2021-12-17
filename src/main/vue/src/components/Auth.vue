<template>
    <div id="content">
        <script type="application/javascript">
            $(document)
                .ready(function() {
                    $('.ui.form').form({
                        fields: {
                            username: {
                                identifier: 'username',
                                rules: [
                                    {
                                        type: 'empty',
                                        prompt: 'Please enter your username'
                                    },
                                    {
                                        type: 'length[3]',
                                        prompt: 'Your name must be at least 3 characters'
                                    }
                                ]
                            },
                            password: {
                                identifier: 'password',
                                rules: [
                                    {
                                        type: 'empty',
                                        prompt: 'Please enter your password'
                                    },
                                    {
                                        type: 'length[6]',
                                        prompt: 'Your password must be at least 6 characters'
                                    }
                                ]
                            }
                        }
                    })
                    ;
                })
            ;
        </script>
        <div class="ui inverted center aligned segment" style="border-radius: 0; margin-top: 0;">
            <div class="ui container">
                <h1 class="ui header inverted grey">Асташин Сергей P3230 | Вариант 30903</h1>
            </div>
        </div>
        <div class="ui middle aligned center aligned grid" style="margin-top: 26vh;margin-bottom: 26vh;">
            <div class="column" style="width: 400px;">
                <div class="ui raised segment">
                    <form class="ui large form" action="/main">
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="user icon"></i>
                                <input type="text" name="username" placeholder="Username">
                            </div>
                        </div>
                        <div class="field">
                            <div class="ui left icon input">
                                <i class="lock icon"></i>
                                <input type="password" name="password" placeholder="Password">
                            </div>
                        </div>
                        <div class="ui large buttons" style="justify-content: center;">
                            <button class="ui fade animated blue submit button" style="width: 168px">
                                <div class="visible content">Login</div>
                                <div class="hidden content">
                                    <i class="right arrow icon"></i>
                                </div>
                            </button>
                            <div class="or"></div>
                            <button class="ui fade animated green submit button" style="width: 168px">
                                <div class="visible content">Register</div>
                                <div class="hidden content">
                                    <i class="check icon"></i>
                                </div>
                            </button>
                        </div>
                        <div class="ui fitted horizontal divider" style="margin-top: 11px;">
                            <a href="" style="color: #D3D3D3; text-transform: none; font-weight: normal; font-style: italic;">Forgot password?</a>
                        </div>
                        <div class="ui error message" style="background-color: white"></div>
                    </form>
                </div>
            </div>
        </div>
        <div class="ui inverted vertical footer segment" style="padding: 19px;top: 1px;">
            <div class="ui center aligned container">
                <div class="ui horizontal inverted small divided link list">
                    <a class="item" href="#">Site Map</a>
                    <a class="item" href="#">Contact Us</a>
                    <a class="item" href="#">Terms and Conditions</a>
                    <a class="item" href="#">Privacy Policy</a>
                </div>
            </div>
        </div>
    </div>
</template>
