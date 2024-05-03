{
  "lookupLevel": "DETAILED",
  "query": {
    "gateway": "{{.request.gateway}}",
    "id": "{{.customer.id}}",
    "searchEmail": "",
    "searchPhone": "",
    "accountNumber": "{{.request.accountNumber}}",
    "emailCustomer": "{{.customer.primaryEmailAddress}}",
    "phoneCustomer": "{{.customer.primaryPhoneNumber.number}}",
    "emails": [      
      {{range .customer.emailAddresses}}
        "{{.}}",
      {{end}}
    ],
    "phones": [
      {{range .customer.phoneNumbers}}
          "{{.number}}",
      {{end}}
    ]
  },
  "uniqueMatchRequired": true
}