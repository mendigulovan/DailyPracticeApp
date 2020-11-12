function sayhello() {
alert ('hi!');
}

      var tincan = new TinCan (
    {
        recordStores: [
            {
                endpoint: "https://lrs.example.com/tin-can-endpoint/",
                username: "mendigulovan",
                password: "1234",
                allowFail: false
            }
        ]
    }

    tincan.sendStatement(
        {
            actor: {
                mbox: "mailto:your.email.address@example.com"
            },
            verb: {
                id: "http://adlnet.gov/expapi/verbs/attempted"
            },
            target: {
                id: "https://experienceapi.com/activities/sending-my-first-statement"
            }
        },
        function (err, result) {
            //Handle any errors here. This code just outputs the result to the page.
            document.write("<pre>");
            document.write(JSON.stringify(err, null, 4));
            document.write("</pre>");
            document.write("<pre>");
            document.write(JSON.stringify(result, null, 4));
            document.write("</pre>");
        }

);