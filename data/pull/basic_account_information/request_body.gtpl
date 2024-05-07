{
  "lookupLevel": "DETAILED",
  "query": {
    "gateway": "{{.customer.gateway}}",
    "searchEmail": "",
    "searchPhone": "",
    "accountNumber": "{{.customer.accountNumber}}",
    "emailCustomer": "{{.customer.primaryEmailAddress}}",
    "phoneCustomer": "{{.customer.primaryPhoneNumber.number}}",
    "emails": [      
      {{if .customer.emailAddresses}}
        {{$size := (len .customer.emailAddresses)}}
        {{range $index, $email := .customer.emailAddresses}}
          "{{$email}}"{{if not (eq $index (sub $size 1))}},{{end}}
        {{end}}
      {{end}}
    ],
    "phones": [
      {{if .customer.phoneNumbers}}
        {{$size := (len .customer.phoneNumbers)}}
        {{range $index, $phoneNumber := .customer.phoneNumbers}}
            "{{$phoneNumber.number}}"{{if not (eq $index (sub $size 1))}},{{end}}
        {{end}}
      {{end}}
    ]
  },
  "uniqueMatchRequired": true
}