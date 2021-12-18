<template>
    <div id="content">
        <script type="application/javascript">
            $(document)
                .ready(function () {
                    $('.ui.form').form({
                        fields: {
                            username: {
                                identifier: 'username',
                                rules: [
                                    {
                                        type: 'empty',
                                        prompt: 'Your username can\'t be empty'
                                    },
                                    {
                                        type: 'length[3]',
                                        prompt: 'Username must contain at least 3 characters'
                                    }
                                ]
                            },
                            password: {
                                identifier: 'password',
                                rules: [
                                    {
                                        type: 'empty',
                                        prompt: 'Your password can\'t be empty'
                                    },
                                    {
                                        type: 'length[6]',
                                        prompt: 'Password must contain at least 6 characters'
                                    }
                                ]
                            }
                        }
                    })
                    ;
                })
            ;
        </script>
        <div class="ui inverted vertical center aligned segment">
            <h2 class="ui header inverted grey">Асташин Сергей P3230 | Вариант 30903</h2>
        </div>
        <div class="ui middle aligned center aligned grid" style="margin-top: 75px;">
            <div class="column" style="width: 400px;">
                <div class="ui raised black segment">
                    <h2 class="ui header">Authentication</h2>
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
                            <a href="" class="forgot">Forgot password?</a>
                        </div>
                        <div class="ui error message"></div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</template>
