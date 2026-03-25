rule MatchComponents
  match c: Concise!Component
  with h: Hash!Component
{
  compare: c.name == h.circuitName
}

rule MatchRoots
  match cr : Concise!Netlist
  with hr : Hash!HashModel
{
  // This will only be true if they are both roots of their models
  compare: cr.eContainer() == hr.eContainer()
}