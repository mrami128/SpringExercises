/*
 * This source file is subject to the license that is bundled with this package in the file LICENSE.
 */
(function($) {
    request = $.ajax({
        'url': '/posts.json'
    });
    request.done(function (posts) {
        var html = '';
        posts.forEach(function(post) {
            html += '<div>';
            html += '<h1>' + post.title + '</h1>';
            html += '<p>' + post.body + '</p>';
            html += '<p>Published by ' + post.owner.username + '</p>';
            html += '</div>';
        });
        $('#posts').html(html);
    });
})(jQuery);